	$(document).ready(function() {



	 var userLoginInput;

		
	 $('#login').submit(function(ev) {
		 
				
		//transition to the "about us" page with a slideup transition
      $.mobile.changePage( "details.html?");

	
		
		return false;
		
    });
    
    $('#errorDiv').click(function() 
    {
    $('#errorDiv').text("");      
    });
    
	function showErrorDiv(message){
		
	 $('#errorDiv').append(message);
	   
	}
	
	
	 $('#details').live("click",function() 
    {
		
     $.mobile.changePage("dashboard.html" );
     	    
    });
    
     $('#menu').live("click",function() 
    {
		
     $.mobile.changePage("menu.html" );
     	    
    });
    $('#home').live("click",function() 
    {
		
     $.mobile.changePage("search.html");
     	    
    });
    
    
	
	
	
	
	
	
	
	
	
	
	
	

		
	});

	
		
