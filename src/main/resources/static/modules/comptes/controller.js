'use strict';
angular.module('Compte')
.controller('CmpController',['$scope','$http',
		function($scope,$http)
{
	$scope.comptes=[];
	$scope.motCle=null;

		//list Client
	function charger1(){
	$http.get("/comptes/")
	.success(function(data){
	$scope.comptes=data;

	});
	};

	charger1();
	//find by mc
	$scope.charger=function(){
	$http.get("/comptesParMC?mc="+$scope.motCle)
	.success(function(data){
	$scope.comptes=data;
	});
	};
	//delete
	$scope.supprimer=function(C){
		
		$http.get("/compte/delete?num="+C.num)
		.success(function(){
			charger1();
		});
		charger1();
		};
		
		$scope.Ajouter = function(){		
			
			var dataObj = {
					numCompte: $scope.numCompte,
					solde : $scope.solde,
					dateCreation : $scope.dateCreation
//					code : $scope.code
					
			};	
			var res = $http.post("comptes/save", dataObj);
			res.success(function(data, status, headers, config) {
				$scope.message = data;
			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});		
			
			//$scope.clients='';
			charger1();
		};	
		
		$scope.Enregi=function(D){
		$http.get("/compte/update?numCompte="+($scope.comptes).numCompte+"&solde="+$scope.solde+"&dateCreation="+$scope.dateCreation)
		.success(function(){
			charger1();
		});
		
		};

	$scope.Modifier=function(C){
		$scope.comptes=C;
		$scope.numCompte=C.numCompte;
		$scope.solde=C.solde;
		$scope.dateCreation=C.dateCreation;
		
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