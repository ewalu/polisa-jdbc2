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
        skladka : null,
        signDate : null,
        statusPolisy : null
    }


    scope.zapiszPolise = () =>{
        $http(
            {
                method: 'GET',
                //params: scope.model,
                url: 'http://localhost:8080/EJBSzkol-0.0.1-SNAPSHOT/api/polisa/create/'+scope.model.numerPolisy+'/'+scope.model.ubezpieczajacy+'/'+scope.model.skladka+'/'+scope.model.statusPolisy,
                //params: {"numerPolisy": model.numerPolisy, "ubezpieczajacy": model.ubezpieczajacy, "skladka": model.skladka},
                //data: scope.model,
                headers: {'Content-Type': 'application/json '},
                withCredentials: true
            }
        ).then(
            (response) => {
            isSave = true;
           alert(`Poprawnie zapisano dane polisy: ${response.data.numerPolisy}`);
           console.log('ewa666'+response);
        }, (response) => {
            alert('Błąd zapisu danychd dla: ' + scope.model.numerPolisy);
            console.log('ewa666'+response);
        }
    );
    }
});