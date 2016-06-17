angular.module('loginPage')
	   .controller('LoginPageController', function($scope, $http, $rootScope, $location) {
		   var self = this

		   var authenticate = function(credentials, callback) {

		     var headers = credentials ? {authorization : "Basic "
		         + btoa(credentials.username + ":" + credentials.password)
		     } : {};

		     $http.post('/j_spring_security_check', {headers : headers}).then(function(response) {
		       if (response.data.name) {
		         $rootScope.authenticated = true;
		       } else {
		         $rootScope.authenticated = false;
		       }
		       callback && callback();
		     }, function() {
		       $rootScope.authenticated = false;
		       callback && callback();
		     });

		   }

		   //authenticate();
		   self.credentials = {};
		   self.login = function() {
		       authenticate(self.credentials, function() {
		         if ($rootScope.authenticated) {
		           $location.path("/");
		           self.error = false;
		         } else {
		           $location.path("/createPlayer");
		           self.error = true;
		         }
		       });
		   };
	   });