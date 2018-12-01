var app = angular.module("myApp", ['ngCookies']);



app.controller('myCtrl', function($scope, $http,$window,$location, $cookies) {
		//console.log(localStorageService.get('uname'));
	
	 $scope.SetCookies = function () {
	        $cookies.put("username", $scope.username);
	    };
	    $scope.GetCookies = function () {
	        $window.alert($cookies.get('username'));
	    };
	    $scope.ClearCookies = function () {
	        $cookies.remove('username');
	    };
	$scope.uname=$cookies.get('username');
	$scope.hotelList=[];
	$scope.hotels=[];
	console.log($scope.uname+' a');
	$http.get('/hotel').then(function(success) {
  		console.log(success.data);
  		$scope.hotelList=success.data;	
	}, function(error) {
		console.log("fail");
	});
	
		
		$scope.login=function(u){
			console.log('clicked');
		
			
		  	$http.get('/checkcredentials?id='+u.username+'&pwd='+u.userpwd).then(function(success) {
		  		console.log(success.data);
		  		if(success.data==2)
		  			{
		  			$scope.loginstatus='Invalid credentials';
		  			}
		  		else if(success.data==0){
		  			$scope.uname='def';
		  			$window.location.href = "bookingPage.html";
		  			$cookies.put("username", $scope.u.username);
		  			//$location.url="shoppingpage.html";
		  			
		  		}
		  			
			}, function(error) {
				console.log("fail");
			});
		  		
		}
		
	$scope.stars=[1,2,3,4,5];
	$scope.selectedHotel;
	
	 $scope.search = function (row) {
	        return !!((row.name.indexOf($scope.query || '') !== -1 || row.address.indexOf($scope.query || '') !== -1));
	    };
	$scope.hotelDetails=function(id){
		for(var x=0;x<$scope.hotelList.length;x++)
			{
			if(id==$scope.hotelList[x].id)
				{
				$scope.selectedHotel=$scope.hotelList[x];
				}
			}
		var location = {lat: parseInt($scope.selectedHotel.latitude), lng: parseInt($scope.selectedHotel.longitude)};
        var map = new google.maps.Map(document.getElementById('googleMap'), {
          zoom: 9,
          center: location
        });
        var marker = new google.maps.Marker({
          position: location,
          map: map
        });
		console.log($scope.selectedHotel)
	}
	

});


