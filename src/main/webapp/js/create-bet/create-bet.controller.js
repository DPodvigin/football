angular.module('createBet')
	   .controller('CreateBetController', function($scope, $http, $location) {
		   $scope.bet = {};
		   $scope.bet.games = [];
		   
		   $scope.init = function() {
			   $http.get('/teams/all').then(function success(response) {
			    	$scope.teams = response.data;
			   });
		   };
		   $scope.init();
		   
		   $scope.addGame = function() {
			   var game = {};
			   game.houseTeam = $scope.teams.find(function(item) { return item.id == $scope.selectedGame.houseTeamId });
			   game.visitorTeam = $scope.teams.find(function(item) { return item.id == $scope.selectedGame.visitorTeamId });
			   $scope.bet.games.push(game);
		   };
		   
		   $scope.createBet  = function() {
    		   $http.post('/globalBet/create', $scope.bet)
			    .then(function success(response) {
			    	$location.path('/')
			    }, function error(response) {
			    }
		   );
		   };
	   });