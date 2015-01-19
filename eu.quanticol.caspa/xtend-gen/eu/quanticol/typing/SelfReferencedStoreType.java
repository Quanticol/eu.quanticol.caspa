package eu.quanticol.typing;

import eu.quanticol.typing.ExpressionsType;

@SuppressWarnings("all")
public class SelfReferencedStoreType implements ExpressionsType {
  public String toString() {
    return "self reference";
  }
}
