package test

object InlineParts {
  inline def test(): String = {
    "Hello " + test2()
  }

  inline def test2(): String = {
    "world"
  }
}
