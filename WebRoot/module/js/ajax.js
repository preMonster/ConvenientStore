function ajax(options){
	$.ajax({

	             type: "GET",

	             url: options.url,

	             dataType: "json",

	             success: options.success

	});
}