/**
 * 
 */
app.factory('JobService',function($http){
var jobService={}	
jobService.addJob=function(job){
	return $http.post("http://localhost:8096/project2_middleware/addjob",job)
}

jobService.getAlljobs=function(){
	return $http.get("http://localhost:8096/project2_middleware/getalljobs")
}
return jobService;
})