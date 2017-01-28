'use strict';
angular.module('Employe')
.controller('EmpController',['$scope','$http',
		function($scope,$http)
{
	$scope.employes=[];
	$scope.motCle=null;

		//list Client
	function charger1(){
	$http.get("/employes/")
	.success(function(data){
	$scope.employes=data;

	});
	};
	charger1();
	
	//delete
	$scope.supprimer=function(C){
		
		$http.get("/employe/delete?codeEmploye="+C.codeEmploye)
		.success(function(){
			charger1();
		});
		charger1();
		};
		
		$scope.Ajouter = function(){		
			
			var dataObj = {
					nomEmploye: $scope.nomEmploye,
					
					
			};	
			var res = $http.post("employes/save", dataObj);
			res.success(function(data, status, headers, config) {
				$scope.message = data;
				charger1();
			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});		
			
			charger1();
		};	
		
		$scope.Enregi=function(D){
		$http.get("/employe/update?nomEmploye="+($scope.employes).nomEmploye)
		.success(function(){
			charger1();
		});
		
		};

	$scope.Modifier=function(C){
		$scope.employes=C;
		$scope.nomEmploye=C.nomEmploye;
		
		
		};		
	
	

		$scope.gotoPage=function(p){
			$scope.pageCourante=p;

			if ($scope.motCle == null){ 
			charger1();
			} else { 
				
			charger1();
			}

			};
		

	
	}]);