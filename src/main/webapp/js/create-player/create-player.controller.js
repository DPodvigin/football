angular.module('createPlayer')
	   .controller('CreatePlayerController', function($scope, $http, $location) {
		   $scope.usernameExists = false;
		   $scope.createPlayer = function(isValid) {
    		   if (isValid) {
    			   playerForm.name.$pristine = true;
	    		   $http.post('/players/create', $scope.player)
					    .then(function success(response) {
					    	$location.path('/')
					    }, function error(response) {
					    	var result = response.data;
					    	if (result == 'username.exists') {
					    		$scope.usernameExists = true;
					    	}
					    }
				   );
    		   }
		   }
	   });