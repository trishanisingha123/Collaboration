/**
 * 
 */
app.factory('BlogService',function($http){
	var blogService={}
	
	blogService.addBlog=function(blog){
		return $http.post("http://localhost:8096/project2_middleware/addblogpost",blog)
	}
	blogService.getBlogsWaitingForApproval=function(){
		return $http.get("http://localhost:8096/project2_middleware/blogswaitingforapproval")
	}
	
	blogService.getBlogsApproved=function(){
		return $http.get("http://localhost:8096/project2_middleware/blogsapproved")
	}
	blogService.getBlog=function(blogPostId){
		return $http.get("http://localhost:8096/project2_middleware/getBlog/"+blogPostId)
	}
	blogService.approve=function(blogPost)
	{
		return $http.put("http://localhost:8096/project2_middleware/approve",blogPost)
	}
	blogService.reject=function(blogPost,rejectionReason)
	{
		return $http.put("http://localhost:8096/project2_middleware/reject/"+rejectionReason,blogPost)
	}
	blogService.hasUserLikedBlogPost=function(blogPostId)
	{
		return $http.get("http://localhost:8096/project2_middleware/hasUserLikedBlogPost/"+blogPostId)
	}
	blogService.updateLikes=function(blogPostId)
	{
	return $http.put("http://localhost:8096/project2_middleware/updatelikes/"+blogPostId)
	}
	blogService.userLikes=function(blogPostId)
	{
		return $http.get("http://localhost:8096/project2_middleware/userliked/"+blogPostId)
	}
	blogService.addBlogComment=function(blogComment)
	{
		return $http.post("http://localhost:8096/project2_middleware/addblogcomment",blogComment)
	}
	blogService.getAllBlogComments=function(blogPostId){
		return $http.get("http://localhost:8096/project2_middleware/getblogcomments/"+blogPostId)	
		}
	
	return blogService;
})