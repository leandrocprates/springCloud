# springCloud
Modelo Criando Proxy de apis com Spring Cloud Zuul integrado com Eureka e Serviços Rest Customers e Products se registrando no Service discovery (eureka).


<ol>
  <li>Abrir o modulo <b>eurekaserverteste</b> e dar start : <br>
    URL  de acesso :  <a href="http://localhost:8761/">http://localhost:8761/</a> 
  </li>
     
  
  <li>Abrir o modulo <b>zuulserver</b> e dar start :  <br>
    URL  de acesso : <a href="http://localhost:8111">http://localhost:8111</a>    
  </li>

  
  
  <li>Abrir o modulo <b>customers</b> e dar start :  <br>
    URL de acesso direto ao serviço : <a href="http://localhost:9095/customers">http://localhost:9095/customers </a> <br>
    URL  de acesso via Zuul Proxy  : <a href="http://localhost:8111/api/customers/customers">http://localhost:8111/api/customers/customers </a>    
  </li>


  <li>Abrir o modulo <b>products</b> e dar start :    <br>
    URL de acesso direto ao serviço : <a href="http://localhost:9090/products">http://localhost:9090/products </a>    <br>
    URL  de acesso via Zuul Proxy  : <a href="http://localhost:8111/api/products/products">http://localhost:8111/api/products/products</a>    
  </li>

  
  
</ol>  





