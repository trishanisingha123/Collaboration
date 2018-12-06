/**
 * 
 */
app.factory('UserService',function($http){
	var userService={}
	
	userService.registration=function(user){
		return $http.post("http://localhost:8096/project2_middleware/register",user)	
		
	}
	
	
	userService.login=function(user)
	{
		return $http.put("http://localhost:8096/project2_middleware/login",user)
	}
	
	userService.logout=function()
	{
		return $http.put("http://localhost:8096/project2_middleware/logout")
	}
	return userService;
	
	
	
})