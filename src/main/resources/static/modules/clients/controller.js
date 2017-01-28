'use strict';
angular.module('Client')
.controller('CliController',['$scope','$http',
		function($scope,$http)
{
	$scope.clients=[];
	$scope.motCle=null;

		//list Client
	function charger1(){
	$http.get("/clients/")
	.success(function(data){
	$scope.clients=data;

	});
	};

	charger1();
	//find by mc
	$scope.charger=function(){
	$http.get("/clientsParMC?mc="+$scope.motCle)
	.success(function(data){
	$scope.clients=data;
	});
	};
	//delete
	$scope.supprimer=function(C){
		
		$http.get("/client/delete?code="+C.code)
		.success(function(){
			charger1();
		});
		charger1();
		};
		
		$scope.Ajouter = function(){		
			
			var dataObj = {
					code: $scope.codeCli,
					nom : $scope.nomCli
					
			};	
			var res = $http.post("clients/save", dataObj);
			res.success(function(data, status, headers, config) {
				$scope.message = data;
				charger1();
			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
				charger1();
			});		
			
			//$scope.clients='';
			charger1();
		};	
		
		$scope.Enregi=function(D){
		$http.get("/client/update?code="+($scope.clients).code+"&nom="+$scope.nom)
		.success(function(){
			charger1();
		});
		
		};

	$scope.Modifier=function(C){
		$scope.clients=C;
		$scope.code=C.code;
		$scope.nom=C.nom;
		};		
	
	

		$scope.gotoPage=function(p){
			$scope.pageCourante=p;

			if ($scope.motCle == null){ 
			charger1();
			} else { 
				
			charger();
			}

			};
		

	
	}]);