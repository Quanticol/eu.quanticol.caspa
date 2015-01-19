package eu.quanticol.typing;

import eu.quanticol.typing.ExpressionsType;

@SuppressWarnings("all")
public class FreeVariableType implements ExpressionsType {
  public String toString() {
    return "free variable";
  }
}
