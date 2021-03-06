package org.denigma.preview

import org.denigma.binding.extensions._
import org.denigma.binding.views.BindableView
import org.querki.jquery._
import org.scalajs.dom.raw.{Element, HTMLElement}
import rx._

/**
 * Just a simple view for the sidebar, if interested ( see https://github.com/antonkulaga/scala-js-binding )
 */
class SidebarView (val elem: Element) extends BindableView {

  val title = Var("Threejs facade")

  val logo = Var("/resources/logo.jpg")

  override def bindView() = {
    super.bindView()
    $(".ui.accordion").dyn.accordion()
  }

}
