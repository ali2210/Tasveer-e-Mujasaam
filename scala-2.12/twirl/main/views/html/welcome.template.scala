
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/(""" 

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<section id="top">
  <div class="wrapper">
    <h1><a href="https://playframework.com/documentation/"""),_display_(/*7.59*/version),format.raw/*7.66*/("""/Home">"""),_display_(/*7.74*/message),format.raw/*7.81*/("""</a></h1>
  </div>
  <div class="wrapper">
    <h1>Tasveer_e_Mujasaam</h1>
    <img src="assets/images/if_recycling_1936907.png" alt="Redirect..." width="3.5%">
  </div>
</section>

<div id="content" class="wrapper doc">
<article>

  <h3> Knowest thou not the
      beauty of thine own
      face?
      Quit this temper that
      lead thee to war with
      thyself.
      ~Rumi </h3>
    <form class="search" action="">
        <input type="text" placeholder="Search..." name="search">
        <button type="submit"><i class="sw"></i><img src="assets/images/if_starship_3285300.png" alt="" >
        </button>
    </form>

    <section class="content">
        <div class="wrapper">
                <link rel="stylesheet" href="assets/stylesheet/style.css">
            <script src='https://code.jquery.com/jquery-2.2.0.min.js'></script>
            <script src="assets/javascripts/index.js" type="text/javascript"></script>
            <div class="container">
                <div class="row">
                    <div class="pic-container">
                        <div class="parent">
                            <div class="wrapper thumb-1">
                                <div class="content">
                                    <div class="img"></div>
                                    <div class="text">
                                        <div class="line title"></div>
                                        <div class="line subtitle"></div>
                                    </div>
                                    <img
                                            src="assets/images/03_Adorable-Puppy-Pictures-that-Will-Make-You-Melt_358613003_-Ivanova-N-760x506.jpg" alt="1" style="box" width="400px">
                                    <img src="assets/images/557016f46a291.jpg" alt="2"  style="box" width="400px">
                                    <img src="assets/images/6457565-cute-pictures.jpg" alt="3"  style="box"
                                         width="400px">
                                    <img src="assets/images/stock-photo-beautiful-beach-and-ocean-scenes-in-florida-keys-400331440.jpg" alt="3"  style="box"
                                         width="400px">
                                    <img src="assets/images/plant.jpg" alt="3"  style="box"
                                         width="400px">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="pic-container">
                        <div class="parent">
                            <div class="wrapper thumb-2">
                                <div class="content">
                                    <div class="img"></div>
                                    <div class="text">
                                        <div class="line title"></div>
                                        <div class="line subtitle"></div>
                                    </div>
                                    <img src="assets/images/maxresdefault.jpg" alt="3"  style="box"
                                         width="400px">
                                    <img src="assets/images/CuDLNqmWEAEJzGe.jpg" alt="1"  style="box" width="400px">
                                    <img src="assets/images/gettyimages-186440152.jpg" alt="2"  style="box"
                                         width="400px">
                                    <img src="assets/images/pexels-photo-248797.jpeg" alt="3"  style="box"
                                         width="400px">
                                    <img src="assets/images/download.jpg" alt="3"  style="box"
                                         width="400px">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="pic-container">
                        <div class="parent">
                            <div class="wrapper thumb-3">
                                <div class="content">
                                    <div class="img"></div>
                                    <div class="text">
                                        <div class="line title"></div>
                                        <div class="line subtitle"></div>
                                    </div>
                                    <img src="assets/images/images.jpg" alt="1"  style="box" width="400px">
                                    <img src="assets/images/images (1).jpg" alt="2"  style="box" width="400px">
                                    <img src="assets/images/photo-1498144846853-60ca2d43853b.jpg" alt="3"
                                         style="box" width="400px">
                                    <img src="assets/images/scene-of-nature-wallpaper-photos-of-beach-nature-scenes-natural-scene-wallpaper-hd-pics-pc.jpg" alt="3"
                                         style="box" width="400px">
                                    <img src="assets/images/flower.jpg" alt="3"  style="box"
                                         width="400px">

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="pic-container">
                        <div class="parent">
                            <div class="wrapper thumb-4">
                                <div class="content">
                                    <div class="img"></div>
                                    <div class="text">
                                        <div class="line title"></div>
                                        <div class="line subtitle"></div>
                                    </div>
                                    <img src="assets/images/POTD_chick_3597497k.jpg" alt="1"  style="box" width="400px">
                                    <img src="assets/images/potd-squirrel_3519920k.jpg" alt="2"  style="box"
                                         width="400px">
                                    <img src="assets/images/1.jpg" alt="3"
                                         style="box" width="400px">
                                    <img src="assets/images/kung-fu-panda-2-wallpapers-29690-7417627.jpg" alt="3"
                                         style="box" width="400px">
                                    <img src="assets/images/f.jpg" alt="3"  style="box"
                                         width="400px">
                                    <img src="assets/images/shutterstock_121285357.jpg.838x0_q80.jpg" alt="3"  style="box"
                                         width="400px">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </section>


<footer>
    <address>
        <br>
        Kooh(i)Noor HQ<br>
        Lahore, Pakistan<br>
        +92317-428-746-1
        <br>
        <br>
                            <br>    Lightbend  Google <br>
                                      Node4j Orcale <br>

    </address>

</footer>



</article>


</div>
""")))}),format.raw/*157.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 10 20:01:01 PKT 2018
                  SOURCE: E:/Ali Hassan/tasveer_e_Mujasam/app/views/welcome.scala.html
                  HASH: 7ced54e59bdf272e1d1af8727da1ad0ca2b7ef1b
                  MATRIX: 738->1|875->43|904->47|951->86|1001->99|1029->101|1156->202|1183->209|1217->217|1244->224|8544->7493
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|32->7|32->7|32->7|182->157
                  -- GENERATED --
              */
          