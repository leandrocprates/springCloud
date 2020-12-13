# springCloud


Modelo Criando Proxy de apis com Spring Cloud Zuul integrado com Eureka. 


1 ) Abrir o modulo eurekaserverteste e dar start : 

URL  de acesso : http://localhost:8761/ 

2 ) Abrir o modulo zuulserver e dar start :  

URL  de acesso : http://localhost:8111


3 ) Abrir o modulo customers e dar start :  


URL de acesso direto ao serviço : http://localhost:9095/customers 

URL  de acesso via Zuul Proxy  : http://localhost:8111/api/customers/customers


3 ) Abrir o modulo products e dar start :  


URL de acesso direto ao serviço : http://localhost:9090/products

URL  de acesso via Zuul Proxy  : http://localhost:8111/api/products/products


