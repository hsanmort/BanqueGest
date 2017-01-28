'use strict';

// declare modules
angular.module('Client', []);
angular.module('Compte', []);
angular.module('Employe', []);


angular.module('BanqueGest', [
    'Client',
    'Compte',
    'Employe',
    'ngRoute'
])
 
.config(['$routeProvider', function ($routeProvider) {

    $routeProvider
        .when('/client', {
            controller: 'CliController',
            templateUrl: 'modules/clients/view/client.html'

        })
        
        .when('/compte', {
            controller: 'CmpController',
            templateUrl: 'modules/comptes/view/compte.html'

        })
        .when('/employe', {
            controller: 'EmpController',
            templateUrl: 'modules/employes/view/employe.html'

        })

        .otherwise({ redirectTo: '/client' });
}]);