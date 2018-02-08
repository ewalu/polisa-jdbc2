const app = angular.module("app",[]);
app.controller('mojCtrl', function($scope, $http){
    const scope = $scope;
    scope.mojTekst = 'test';

    scope.isSave = 'false';

    scope.statusy=[
        'ZATWIERDZONA',
        'ZAWIESZONA',
        'ROZWIAZANA'

    ];

    scope.model = {
        numerPolisy : null,
        ubezpieczajacy : null,
        skladka : null//,
        //signDate : null,
        //statusPolis : null
    }

    scope.zapiszPolise = () =>{
        $http(
            {
                method: 'GET',
                url: '/polisa-jdbc2/EJBSzkol/api/polisa/create',
                data: scope.model,
                headers: {'Content-Type': 'application/json '}
            }
        ).then((response) => {
            isSave = true;
            alert(`Poprawnie zapisano dane polisy. Id: ${response.data.id}`);
        }, (response) => {
            alert('Błąd zapisu danych: ' + response.data);
        });
    }
});