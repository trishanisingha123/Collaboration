/**
 * 
 */
app.controller('NotificationCtrl',function($rootScope,NotificationService,$location,$scope,$routeParams){
	
	var notificationId=$routeParams.id
	function getAllNotifications(){	
NotificationService.getAllNotifications().then(
function(response){
	
	$rootScope.notifications=response.data
	$rootScope.notificationCount=$rootScope.notifications.length
	
}	,function(response)	{
	if(response.data==401)
		$location.path('/login')
	
})
	}
if(notificationId!=undefined){
NotificationService.getNotification(notificationId).then(
function(response){
	$scope.notification=response.data
},
function(response){
	if(response.status==401)
		$location.path('/login')

})

	NotificationService.updateNotification(notificationId).then(
	function(response){
		
		getAllNotifications()
		
	}	,
	function(response){
		
		if(response.status==401)
			$location.path('/login')
	})
	
}
	getAllNotifications()
		
})