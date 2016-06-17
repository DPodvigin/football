angular.module('mainApp')
	   .controller('MainAppController', function($scope, $http, $rootScope) {
		   $scope.logout = function() {
			   $http.post('/logout');
			   window.location.assign("/login/login.jsp")
		   };
		   
		   $scope.init = function() {
			   $http.get('/user').then(function success(response) {
			    	$rootScope.userRole = response.data.authorities[0].authority;
			    	console.log($rootScope.userRole);
			   });
		   };
		   $scope.init();
	   });