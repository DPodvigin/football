angular.module('mainApp')
	   .config(['$routeProvider', 
	            function config($routeProvider) {
			   		$routeProvider.
				   		when('/createPlayer', {
				   			controller: 'CreatePlayerController',
				   			templateUrl: 'js/create-player/create-player.template.html'
				   		})
				   		.when('/loginPage', {
				   			controller: 'LoginPageController',
				   			templateUrl: 'js/login-page/login-page.template.html'
				   		});
	   			}
	   ]);