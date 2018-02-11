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
        //statusPolisy : null
    }


    scope.zapiszPolise = () =>{
        $http(
            {
                method: 'GET',
                //params: scope.model,
                url: 'http://localhost:8080/EJBSzkol/api/polisa/create/'+scope.model.numerPolisy+'/'+scope.model.ubezpieczajacy+'/'+scope.model.skladka,
                //params: {"numerPolisy": model.numerPolisy, "ubezpieczajacy": model.ubezpieczajacy, "skladka": model.skladka},
                //data: scope.model,
                headers: {'Content-Type': 'application/json '}
            }
        ).then(
            (response) => {
            isSave = true;
            alert(`Poprawnie zapisano dane polisy. Id: ${response.data.id}`);
        }, (response) => {
            alert('Błąd zapisu danych: ' + response.data.id);
        }
    );
    }
});