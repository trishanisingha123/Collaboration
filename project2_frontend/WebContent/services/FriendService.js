/**
 * 
 */
app.factory('FriendService',function($http){
	var friendService={}

	friendService.getAllSuggestedUsers=function(){
		return $http.get("http://localhost:8096/project2_middleware/suggestedusers")
	}
	
	friendService.sendFriendRequest=function(user){//value for toId property in Friend Entity
		return $http.post("http://localhost:8096/project2_middleware/friendrequest",user)
	}
	
	friendService.getPendingRequests=function(){
		return $http.get("http://localhost:8096/project2_middleware/pendingrequests")
	}
	
	friendService.acceptRequest=function(friendRequest){
		return $http.put("http://localhost:8096/project2_middleware/acceptrequest",friendRequest)
	}
	friendService.deleteRequest=function(friendRequest){
		return $http.put("http://localhost:8096/project2_middleware/deleterequest",friendRequest)
	}
	
	friendService.getAllFriends=function(){
		return $http.get("http://localhost:8096/project2_middleware/friends")
	}
	
	return friendService;
})
