// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Ali Hassan/tasveer_e_Mujasam/conf/routes
// @DATE:Thu Aug 09 20:30:52 PKT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
