
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lubuntu/swiftcode-bnmit/conf/routes
// @DATE:Sun Aug 21 11:06:47 UTC 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_2: controllers.Assets,
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:10
  ConnectionController_3: controllers.ConnectionController,
  // @LINE:13
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_2: controllers.Assets,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:10
    ConnectionController_3: controllers.ConnectionController,
    // @LINE:13
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, Assets_2, Application_1, ConnectionController_3, HomeController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, Application_1, ConnectionController_3, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Application.signup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """request/send/""" + "$" + """senderId<[^/]+>/""" + "$" + """toId<[^/]+>""", """controllers.ConnectionController.sendConnectionRequest(senderId:Long, toId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """request/accept/""" + "$" + """requestId<[^/]+>""", """controllers.ConnectionController.acceptConnectionRequest(requestId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.getProfile(userId:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.updateProfile(userId:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_signup1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_signup1_invoker = createInvoker(
    Application_1.signup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "signup",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login2_invoker = createInvoker(
    Application_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ConnectionController_sendConnectionRequest3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("request/send/"), DynamicPart("senderId", """[^/]+""",true), StaticPart("/"), DynamicPart("toId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConnectionController_sendConnectionRequest3_invoker = createInvoker(
    ConnectionController_3.sendConnectionRequest(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConnectionController",
      "sendConnectionRequest",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """request/send/""" + "$" + """senderId<[^/]+>/""" + "$" + """toId<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ConnectionController_acceptConnectionRequest4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("request/accept/"), DynamicPart("requestId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConnectionController_acceptConnectionRequest4_invoker = createInvoker(
    ConnectionController_3.acceptConnectionRequest(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConnectionController",
      "acceptConnectionRequest",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """request/accept/""" + "$" + """requestId<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_getProfile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProfile5_invoker = createInvoker(
    HomeController_0.getProfile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProfile",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """profile/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_updateProfile6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProfile6_invoker = createInvoker(
    HomeController_0.updateProfile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProfile",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """profile/""" + "$" + """userId<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:7
    case controllers_Application_signup1_route(params) =>
      call { 
        controllers_Application_signup1_invoker.call(Application_1.signup())
      }
  
    // @LINE:8
    case controllers_Application_login2_route(params) =>
      call { 
        controllers_Application_login2_invoker.call(Application_1.login())
      }
  
    // @LINE:10
    case controllers_ConnectionController_sendConnectionRequest3_route(params) =>
      call(params.fromPath[Long]("senderId", None), params.fromPath[Long]("toId", None)) { (senderId, toId) =>
        controllers_ConnectionController_sendConnectionRequest3_invoker.call(ConnectionController_3.sendConnectionRequest(senderId, toId))
      }
  
    // @LINE:11
    case controllers_ConnectionController_acceptConnectionRequest4_route(params) =>
      call(params.fromPath[Long]("requestId", None)) { (requestId) =>
        controllers_ConnectionController_acceptConnectionRequest4_invoker.call(ConnectionController_3.acceptConnectionRequest(requestId))
      }
  
    // @LINE:13
    case controllers_HomeController_getProfile5_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_HomeController_getProfile5_invoker.call(HomeController_0.getProfile(userId))
      }
  
    // @LINE:14
    case controllers_HomeController_updateProfile6_route(params) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_HomeController_updateProfile6_invoker.call(HomeController_0.updateProfile(userId))
      }
  }
}
