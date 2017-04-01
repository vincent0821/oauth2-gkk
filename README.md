# oauth2-gkk


主要分两步：  

1.客户端从服务端获得授权，并保存授权码。 
	验证：如果服务端拥有客户端的client-id，就认为客户端可有此权限。  
	
2.客户端根据授权码去服务端获得token。
	验证：如果服务端持有的授权code和客户端的授权code相同，就认为客户端有此权限。  
	

授权请求：  
http://localhost:8080/oauth/authorize/code?response_type=code&client_id=2882303761517520186&redirect_uri=http://www.example.com&scope=1%204&state=emhlbmNoYW8gcGFzc3BvcnQgb2F1dGg=

token请求（其中最后一个请求参数code要根据‘授权请求’响应中的code做修改）：  
http://localhost:8080/oauth/authorize／token?client_id=2882303761517520186&client_secret=CLIENT_SECRET&grant_type=authorization_code&redirect_uri=www.example.com&code=947484979
