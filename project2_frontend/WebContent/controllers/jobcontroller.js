/**
 * 
 */
app.controller('JobCtrl',function($scope,JobService,$location){
	$scope.addJob=function(job){
	JobService.addJob(job).then(function(response){
		alert('job details posted successfully..')
		$scope.job={}
		$scope.error=""
	},
	function(response){
		$scope.error=response.data
		if($scope.error.errorCode==5)
			$location.path('/login')
			
		
	})
	}
	JobService.getAlljobs().then(function(response){
		//response.data?
		$scope.jobs=response.data
	},function(response){
		if(response.status==401)
			$location.path('/login')
	})
	
	$scope.showDetails=function(jobId){
		$scope.isClicked=!$scope.isClicked;
		$scope.jobId=jobId;
	}
    	

})