<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html ng-app="indexApp">  
  <jsp:include page="fragments/header.jsp" /> 
 <body> 
  <div class="container"> 
   <jsp:include page="fragments/nav.jsp" /> 
  </div> 
  <div class="container"> 
   <!--slider开始--> 
   <div id="carousel-example-generic" class="carousel slide" data-ride="carousel"> 
    <!-- Indicators --> 
    <ol class="carousel-indicators"> 
     <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li> 
     <li data-target="#carousel-example-generic" data-slide-to="1"></li> 
     <li data-target="#carousel-example-generic" data-slide-to="2"></li> 
    </ol> 
    <!-- Wrapper for slides --> 
    <div class="carousel-inner" role="listbox"> 
     <div class="item active"> 
      <img src="common/img/1.jpg" alt="..." /> 
      <div class="carousel-caption"> 
       <h2>你们的偶像都是明星，我的偶像，是一颗卫星</h2> 
      </div> 
     </div> 
     <div class="item"> 
      <img src="common/img/2.jpg" alt="..." /> 
      <div class="carousel-caption"> 
       <h2>从今天起，开始一场说走就走的旅行。</h2> 
      </div> 
     </div> 
     <div class="item"> 
      <img src="common/img/3.jpg" alt="..." /> 
      <div class="carousel-caption"> 
       <h2>生命中不光有苟且，还有诗和远方。</h2> 
      </div> 
     </div> 
    </div> 
    <!-- Controls --> 
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span class="sr-only">Previous</span> </a> 
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next"> <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span class="sr-only">Next</span> </a> 
   </div> 
  </div> 
  <div class="container"> 
   <div class="headline margin-bottom-35"> 
    <h2>美景</h2> 
   </div> 
  </div> 
  <!--slider结束--> 
  <div class="container container-sm" ng-controller="ScencesController"> 
   <!-- Easy Blocks v1 --> 
   <div class="row high-rated margin-bottom-20"> 
    <div ng-hide="showing"> 
     <img src="common/img/loading.gif" /> 
    </div> 
    <div ng-show="showing"> 
     <!-- 启动ng-repeat --> 
     <div class="col-md-3 col-sm-6 md-margin-bottom-40" ng-repeat="scence in scences"> 
      <div class="easy-block-v1"> 
       <div class="easy-block-v1-badge rgba-default">
         {{scence.name}} 
       </div> 
       <div id="carousel-example-generic2{{$index}}" class="carousel slide" data-ride="carousel"> 
        <ol class="carousel-indicators"> 
         <li class="rounded-x active" data-target="#carousel-example-generic" data-slide-to="0"></li> 
         <li class="rounded-x" data-target="#carousel-example-generic" data-slide-to="1"></li> 
         <li class="rounded-x" data-target="#carousel-example-generic" data-slide-to="2"></li> 
        </ol> 
        <div class="carousel-inner"> 
         <div class="item active"> 
          <img alt="" ng-src="scence/images/{{scence.images[0].name}}" /> 
         </div> 
         <div class="item"> 
          <img alt="" ng-src="scence/images/{{scence.images[1].name}}" /> 
         </div> 
         <div class="item"> 
          <img alt="" ng-src="scence/images/{{scence.images[2].name}}" /> 
         </div> 
        </div> 
       </div> 
       <div class="overflow-h"> 
        <h3>{{scence.name}}</h3> 
        <div class="star-vote pull-right"> 
         <!--小星星--> 
         <ul class="list-inline"> 
          <li><i class="color-green fa fa-star"></i></li> 
          <li><i class="color-green fa fa-star"></i></li> 
          <li><i class="color-green fa fa-star"></i></li> 
          <li><i class="color-green fa fa-star-half-o"></i></li> 
          <li><i class="color-green fa fa-star-o"></i></li> 
         </ul> 
        </div> 
       </div> 
       <ul class="list-unstyled"> 
        <li><span class="color-green">Address:</span> {{scence.address}}</li> 
        <li><span class="color-green">date:</span> {{scence.regdate | date : 'yyyy-MM-dd'}}</li> 
       </ul> 
      </div>
      <!--结束blockv1--> 
     </div> 
     <!-- 结束ng-repeat --> 
    </div>
    <!--结束ng-showing--> 
   </div>
   <!-- row --> 
  </div>
  <!--end contianer--> 
  <div class="clearfix margin-bottom-20"> 
   <hr /> 
  </div> 
  <div class="container"> 
   <div class="headline margin-bottom-35"> 
    <h2>攻略</h2> 
   </div> 
  </div> 
  <!--=== Testimonials v6 ===--> 
  <div class="container content-sm bg-color-light"> 
   <!-- Testimonials Wrap --> 
   <div class="testimonials-v6 testimonials-wrap"> 
    <div class="row margin-bottom-50"> 
     <div class="col-md-6 md-margin-bottom-50"> 
      <div class="testimonials-info rounded-bottom"> 
       <img class="rounded-x" src="http://htmlstream.com/preview/unify-v1.8/assets/img/testimonials/img5.jpg" alt="" /> 
       <div class="testimonials-desc"> 
        <p>我在凤凰古城的三日故事.</p> 
        <strong>Evan Bohringer</strong> 
        <span>Web Developer</span> 
       </div> 
      </div> 
     </div> 
     <!--end 1--> 
     <div class="col-md-6"> 
      <div class="testimonials-info rounded-bottom"> 
       <img class="rounded-x" src="http://htmlstream.com/preview/unify-v1.8/assets/img/testimonials/img6.jpg" alt="" /> 
       <div class="testimonials-desc"> 
        <p>黄山，去多少次都不会后悔的地方.</p> 
        <strong>Sara Lisbon</strong> 
        <span>Designer</span> 
       </div> 
      </div> 
     </div> 
    </div> 
    <!--/end row--> 
    <div class="row margin-bottom-20"> 
     <div class="col-md-6 md-margin-bottom-50"> 
      <div class="testimonials-info rounded-bottom"> 
       <img class="rounded-x" src="http://htmlstream.com/preview/unify-v1.8/assets/img/testimonials/img3.jpg" alt="" /> 
       <div class="testimonials-desc"> 
        <p>在大理，寻找那些曾经拥有的梦.</p> 
        <strong>Alice Williams</strong> 
        <span>Web Developer</span> 
       </div> 
      </div> 
     </div> 
     <div class="col-md-6"> 
      <div class="testimonials-info rounded-bottom"> 
       <img class="rounded-x" src="http://htmlstream.com/preview/unify-v1.8/assets/img/testimonials/img2.jpg" alt="" /> 
       <div class="testimonials-desc"> 
        <p>去青岛租一椽破屋，面朝大海，春暖花开.</p> 
        <strong>Jane Wearne</strong> 
        <span>Technical Direector</span> 
       </div> 
      </div> 
     </div> 
    </div> 
    <!--/end row2--> 
   </div> 
   <!-- End Testimonials Wrap --> 
  </div> 
  <!--/end container--> 
  <div class="clearfix margin-bottom-20"> 
   <hr /> 
  </div> 
  <!--=== End Testimonials v6 --> 
  <div class="container"> 
   <div class="headline margin-bottom-35"> 
    <h2>组团</h2> 
   </div> 
  </div> 
  <!--<div class="bg-grey">--> 
  <div class="container content-sm bg-grey"> 
   <div class="row"> 
    <!-- Bordered Funny Boxes --> 
    <div class="col-md-6 md-margin-bottom-40"> 
     <div class="funny-boxes funny-boxes-top-purple bg-color-white"> 
      <div class="row"> 
       <div class="col-md-4 funny-boxes-img"> 
        <img class="img-responsive" src="http://htmlstream.com/preview/unify-v1.8/assets/img/main/img6.jpg" alt="" /> 
        <ul class="list-unstyled"> 
         <li><i class="fa-fw fa fa-briefcase"></i> Dell, Google</li> 
         <li><i class="fa-fw fa fa-map-marker"></i> New York, US</li> 
        </ul> 
       </div> 
       <div class="col-md-8"> 
        <h2><a href="#">Praesentium Voluptatum</a></h2> 
        <ul class="list-unstyled funny-boxes-rating"> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
        </ul> 
        <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum.</p> 
       </div> 
      </div> 
     </div> 
    </div> 
    <!-- End Bordered Funny Boxes --> 
    <!-- Colored Funny Boxes --> 
    <div class="col-md-6"> 
     <div class="funny-boxes funny-boxes-top-yellow bg-color-white"> 
      <div class="row"> 
       <div class="col-md-4 funny-boxes-img"> 
        <img class="img-responsive" src="http://htmlstream.com/preview/unify-v1.8/assets/img/main/img20.jpg" alt="" /> 
        <ul class="list-unstyled"> 
         <li><i class="fa-fw fa fa-briefcase"></i> Dell, Google</li> 
         <li><i class="fa-fw fa fa-map-marker"></i> New York, US</li> 
        </ul> 
       </div> 
       <div class="col-md-8"> 
        <h2><a href="#">Oluptatum Box</a></h2> 
        <ul class="list-unstyled funny-boxes-rating"> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star-o"></i></li> 
        </ul> 
        <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum.</p> 
       </div> 
      </div> 
     </div> 
    </div> 
    <!--End Colored Funny Boxes --> 
   </div> 
   <div class="row"> 
    <!-- Bordered Funny Boxes --> 
    <div class="col-md-6 md-margin-bottom-40"> 
     <div class="funny-boxes funny-boxes-top-purple bg-color-white"> 
      <div class="row"> 
       <div class="col-md-4 funny-boxes-img"> 
        <img class="img-responsive" src="http://htmlstream.com/preview/unify-v1.8/assets/img/main/img6.jpg" alt="" /> 
        <ul class="list-unstyled"> 
         <li><i class="fa-fw fa fa-briefcase"></i> Dell, Google</li> 
         <li><i class="fa-fw fa fa-map-marker"></i> New York, US</li> 
        </ul> 
       </div> 
       <div class="col-md-8"> 
        <h2><a href="#">Praesentium Voluptatum</a></h2> 
        <ul class="list-unstyled funny-boxes-rating"> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
        </ul> 
        <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum.</p> 
       </div> 
      </div> 
     </div> 
    </div> 
    <!-- End Bordered Funny Boxes --> 
    <!-- Colored Funny Boxes --> 
    <div class="col-md-6"> 
     <div class="funny-boxes funny-boxes-top-yellow bg-color-white"> 
      <div class="row"> 
       <div class="col-md-4 funny-boxes-img"> 
        <img class="img-responsive" src="http://htmlstream.com/preview/unify-v1.8/assets/img/main/img20.jpg" alt="" /> 
        <ul class="list-unstyled"> 
         <li><i class="fa-fw fa fa-briefcase"></i> Dell, Google</li> 
         <li><i class="fa-fw fa fa-map-marker"></i> New York, US</li> 
        </ul> 
       </div> 
       <div class="col-md-8"> 
        <h2><a href="#">Oluptatum Box</a></h2> 
        <ul class="list-unstyled funny-boxes-rating"> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star"></i></li> 
         <li><i class="fa fa-star-o"></i></li> 
        </ul> 
        <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum.</p> 
       </div> 
      </div> 
     </div> 
    </div> 
    <!--End Colored Funny Boxes --> 
   </div> 
   <!--end row--> 
  </div> 
  <!--end container--> 
  <!--</div>end bg-grey--> 
  <div class="clearfix margin-bottom-20"> 
   <hr /> 
  </div> 
  <div class="container"> 
   <div class="headline margin-bottom-35"> 
    <h2>我是旅行者</h2> 
   </div> 
  </div> 
  <div class="container" ng-controller="UsersController"> 
   <ul class="list-unstyled blog-photos margin-bottom-30"> 
    <li ng-repeat="user in users | filter:query"> <a href="#"> <img class="hover-effect" alt="" ng-src="http://htmlstream.com/preview/unify-v1.8/assets/img/sliders/elastislide/{{user.picture}}" /></a></li> 
   </ul> 
  </div> 
  <div class="container-fluid"> 
   <div ng-include="'fragments/footer.html'"></div> 
  </div> 
  <!--end body container--> 
<script type="text/javascript" src="webjars/angularjs/1.3.8/angular.min.js"></script>
<script type="text/javascript" src="common/myjs/services.js"></script>
<script type="text/javascript" src="webjars/bootstrap-material-design/0.2.1/js/material.js"></script> 
<script type="text/javascript" src="index/js/app.js"></script> 
<script type="text/javascript" src="webjars/restangular/1.4.0/restangular.min.js"></script> 
<script type="text/javascript" src="common/js/lodash.min.js"></script> 
 
 </body>
</html>

