
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lubuntu/swiftcode-bnmit/conf/routes
// @DATE:Sun Aug 21 11:06:47 UTC 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseConnectionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def acceptConnectionRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConnectionController.acceptConnectionRequest",
      """
        function(requestId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "request/accept/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("requestId", requestId0)})
        }
      """
    )
  
    // @LINE:10
    def sendConnectionRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConnectionController.sendConnectionRequest",
      """
        function(senderId0,toId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "request/send/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId0) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("toId", toId1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProfile",
      """
        function(userId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0)})
        }
      """
    )
  
    // @LINE:13
    def getProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProfile",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId0)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.signup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
