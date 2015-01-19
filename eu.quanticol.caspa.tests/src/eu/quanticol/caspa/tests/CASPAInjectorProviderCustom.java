package eu.quanticol.caspa.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;

import eu.quanticol.CASPAInjectorProvider;
import eu.quanticol.CASPARuntimeModule;
import eu.quanticol.CASPAStandaloneSetup;

public class CASPAInjectorProviderCustom extends CASPAInjectorProvider {
	
	@Override
    protected Injector internalCreateInjector() {
        return new CASPAStandaloneSetup() {
            @Override
            public Injector createInjector() {
                return Guice.createInjector(new CASPARuntimeModule() {
                    // this is required only by the CompilationTestHelper since
                    // Xtext 2.7
                    @SuppressWarnings("unused")
                    public Class<? extends org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport> bindMutableFileSystemSupport() {
                        return org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport.class;
                    }

                    // this is required only by the CompilationTestHelper since
                    // Xtext 2.7
                    @SuppressWarnings("unused")
                    public Class<? extends com.google.inject.Provider<org.eclipse.xtext.xbase.file.WorkspaceConfig>> provideWorkspaceConfig() {
                        return org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider.class;
                    }
                });
            }
        }.createInjectorAndDoEMFRegistration();
    }

}
