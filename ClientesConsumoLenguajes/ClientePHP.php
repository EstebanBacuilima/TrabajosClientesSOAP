<?php

// CREAMOS EL CLIENTE
$cliente = new SoapClient ('http://localhost:8083/ServiciosClienteServidorSOAP/Servicios?WSDL');

// UTILIZACION DE METODOS

$resultado_login = $cliente-> Login ([
    "username" => 'Esteban1234',
    "password" => '0105957922David'
])->return ;

if ($resultado_login == true) {
    echo 'Bienvenido... Credenciales Correctas'. PHP_EOL;;
} else {
    echo 'Credenciales Incorrectas'. PHP_EOL; ;
}

$resultado_pago = $cliente-> ProcesarPago ([
    "total" => 50,
    "pago" => 100
])->return;

if($resultado_pago>=0){
    echo 'Pago Realizado';
} else {
    echo 'Saldo Insuficiente';
}




?>