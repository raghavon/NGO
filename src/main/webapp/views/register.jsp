<html>
<head>
   		<%@ include file="component/head.jsp" %>
</head>
<body>
   		<%@ include file="component/navbar.jsp" %>


<section class="ftco-section-3 img" style="background-image: url(/assets/images/bg_3.jpg);">
    	<div class="overlay"></div>
    	<div class="container">
    		<div class="row d-md-flex">
    		<div class="col-md-6 d-flex ftco-animate">
    			<div class="img img-2 align-self-stretch" style="background-image: url(/assets/images/bg_4.jpg);"></div>
    		</div>
    		<div class="col-md-6 volunteer pl-md-5 ftco-animate">
    			<h3 class="mb-3">Register for future</h3>
	            <p class="mb-5" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Already a member? <a href="#" style="color: white">Login</a></p>

    			<form action="#" class="volunter-form">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Your Name">
            </div>
            <div class="form-group">
              <input type="email" class="form-control" placeholder="Your Email">
            </div>
            <div class="form-group">
              <input type="password" class="form-control" placeholder="Your Password">
            </div>

            <div class="form-group">
              <input type="submit" value="Register" class="btn btn-white py-3 px-5">
            </div>
          </form>
    		</div>
    		</div>
    	</div>
    </section>



   		<%@ include file="component/footer.jsp" %>
</body>
</html>
