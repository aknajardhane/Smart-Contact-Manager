console.log("This is log file");


const toggleSidebar = () => {
	
	if($(".sidebar").is(":visible")){
		//true
		//close it
		$(".sidebar").css("display","none");
		$(".content").css("margin-left","0%");
		
	}
	else{
		//false
		//open it
		
			$(".sidebar").css("display","block");
		    $(".content").css("margin-left","20%");
	}
};


