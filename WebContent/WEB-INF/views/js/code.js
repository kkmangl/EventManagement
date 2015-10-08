$(document).ready(function()
		{
	$("#updDate").click(function(){
		$.ajax({
			url:"rest/date/upd",
			type:"PUT",
			data:{year:"2017",month:"12",day:"13"},
			success:function(result){
				$("#updStatus").html(result);
			}
				
		});
	});
		});