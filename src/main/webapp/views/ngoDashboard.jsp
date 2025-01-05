<html>
<head>
   		<%@ include file="component/head.jsp" %>
   </head>
  <body>
		<%@ include file="component/navbar.jsp" %>

       <!-- dashboard Body section starts -->
    <div class="hero-wrap" style="background-image: url('/assets/images/bg_8.jpg'); margin-top:134px;" data-stellar-background-ratio="0.5" >

    <section class="ftco-counter ftco-intro" style="margin-bottom:80px; " id="section-counter">
    	<div class="container">
    		<div class="row no-gutters" style="padding-top:40px;">

          <div class="col-md d-flex justify-content-center counter-wrap ftco-animate" style="margin-right:20px;">
            <div class="block-18 color-1 align-items-stretch">
              <div class="text">
   	          	<div style="height:70px;">
              	<h3 class="mb-4">APPROVED</h3>
              </div>
              	<p><a href="#" class="btn btn-white px-3 py-2 mt-2">Accepted Approvals</a></p>
              </div>
            </div>
          </div>

          <div class="col-md d-flex justify-content-center counter-wrap ftco-animate" style="margin-right:20px;">
            <div class="block-18 color-2 align-items-stretch">
              <div class="text">
                <div style="height:70px;">
              	<h3 class="mb-4">PENDING</h3>
              	</div>
              <p><a href="#" class="btn btn-white px-3 py-2 mt-2">Pending Approvals</a></p>
              </div>
            </div>
          </div>

          <div class="col-md d-flex justify-content-center counter-wrap ftco-animate" style="margin-right:20px;">
            <div class="block-18 color-3 align-items-stretch">
              <div class="text">
          	<div style="height:70px;">
              	<h3 class="mb-4">REJECTED</h3>
              </div>
              <p><a href="#" class="btn btn-white px-3 py-2 mt-2">Rejected Approvals</a></p>
              </div>
            </div>
          </div>
          <div class="col-md d-flex justify-content-center counter-wrap ftco-animate">
            <div class="block-18 color-2 align-items-stretch">
              <div class="text">
          	<div style="height:70px;">
              	<h3 class="mb-4">Donate HopeWay</h3>
              </div>
              	<p>Help via HopeWay</p>
              	<p><a href="#" class="btn btn-white px-3 py-2 mt-2">Donate Now</a></p>
              </div>
            </div>
          </div>
    		</div>
    	</div>
    </section>
    <div class="chart" style="  background-color: rgba(0, 0, 0, 0.5); margin-right: 40px; margin-left: 40px;">
        <canvas id="chart-line" class="chart-canvas" height="300" ></canvas>
    </div>
</div>



<div class="container" style="margin-top:50px;">
        <div class="row">
            <div class="col-md-7">
                <table class="table table-bordered table-striped "  >

                    <thead>
                        <tr>

                            <th style="width: 100%; ">NGOs you have worked with</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="align-items-center">1.abc</td>

                        </tr>
                        <tr>
                            <td class="align-items-center">2.ab</td>

                        </tr>
                        <tr>
                            <td class="align-items-center">3.ab</td>

                        </tr>
                        <tr>
                            <td class="align-items-center">4.abc</td>

                        </tr>
                        <tr>
                            <td class="align-items-center">5.ab</td>

                        </tr>
                        <tr>
                            <td class="align-items-center">6.ab</td>

                        </tr>
                    </tbody>
                </table>
            </div>
              <div class="col-md-4" >
                            <div class="alert alert-info" style="height:323px;" role="alert" >
                                <strong>*</strong> It is not how much we give but how much love we put into giving : <strong>Mother Theresa.</strong><br>
                                <strong>*</strong> Service to others is the rent you pay for your room here on earth : <strong>Muhammad Ali.</strong><br>
                                <strong>*</strong> No one has ever become poor by giving : <strong>Anne Frank.</strong><br>
                                <strong>*</strong> We make a living by what we get, but we make a life by what we give : <strong>Winston Churchill.</strong><br>
                                <strong>*</strong> The meaning of life is to find your gift. The purpose of life is to give it away : <strong>Pablo.</strong><br>

                            </div>
                        </div>
        </div>
    </div>



       <!-- dashboard Body section ends -->
	    <%@ include file="component/footer.jsp" %>
	                                            <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
												<script>

													var ctx1 = document.getElementById("chart-line").getContext("2d");
													var gradientStroke1 = ctx1.createLinearGradient(0, 230, 0, 50);
													gradientStroke1.addColorStop(1, 'rgba(94, 114, 228, 0.2)');
													gradientStroke1.addColorStop(0.2, 'rgba(94, 114, 228, 0.0)');
													gradientStroke1.addColorStop(0, 'rgba(94, 114, 228, 0)');
													new Chart(ctx1, {
														type: "line",
														data: {
															labels: ["January", "Feburary", "March", "April", "May",
																"June", "July", "August","September", "October", "November", "December"],
															datasets: [{
																label: "Approval Rate",
																tension: 0.4,
																borderWidth: 0,
																pointRadius: 0,
																borderColor: "#5e72e4",
																backgroundColor: gradientStroke1,
																borderWidth: 3,
																fill: true,
																data: [90,10,50,80,60,40,70,50,30,40,20,50],
																maxBarThickness: 6
															}],
														},
														options: {
															responsive: true,
															maintainAspectRatio: false,
															plugins: {
																legend: {
																	display: false,
																}
															},
															interaction: {
																intersect: false,
																mode: 'index',
															},
															scales: {
																y: {
																	grid: {
																		drawBorder: false,
																		display: true,
																		drawOnChartArea: true,
																		drawTicks: false,
																		borderDash: [5, 5]
																	},
																	ticks: {
																		display: true,
																		padding: 10,
																		color: '#fbfbfb',
																		font: {
																			size: 11,
																			family: "Open Sans",
																			style: 'normal',
																			lineHeight: 2
																		},
																	}
																},
																x: {
																	grid: {
																		drawBorder: false,
																		display: false,
																		drawOnChartArea: false,
																		drawTicks: false,
																		borderDash: [5, 5]
																	},
																	ticks: {
																		display: true,
																		color: '#ccc',
																		padding: 20,
																		font: {
																			size: 11,
																			family: "Open Sans",
																			style: 'normal',
																			lineHeight: 2
																		},
																	}
																},
															},
														},
													});
													</script>
</body>
</html>