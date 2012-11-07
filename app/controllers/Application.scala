package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("index"))
  }

  def sleep(ms: Int) = Action {
    Thread.sleep(ms)
    Ok(views.html.index(ms.toString))
  }
}