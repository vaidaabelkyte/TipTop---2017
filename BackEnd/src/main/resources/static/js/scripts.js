/**
 * 
 */

$(document).ready(function() {
	$('.delete-food').on('click', function() {
		/*<![CDATA[*/
		var path = /*[[@{/}]]*/'remove';
		/*]]>*/
		
		var id=$(this).attr('id');
		
		bootbox.confirm({
			message: "Are You sure? The action cant be undone.",
		buttons: {
			cancel: {
				label:'<i class="fa fa-times"></i> Cancel'
			},
			confirm: {
				label:'<i class="fa fa-check"></i> Confirm'
			}
		},
		callback: function(confirmed) {
			if(confirmed) {
				$.post(path, {'id':id}, function(res) {
					location.reload();
				});
			}
		}
			
			
			
		});	
	});

	var foodList=[];
	$('.checkboxFood').click(function() {
		var id=$(this).attr('id');
		if(this.checked){
			foodIdList.push(id);
			
		} else {
			foodIdList.splice(foodIdList.indexOf(id), 1);
		}
	
	})
	
	$('#deleteSelected').click(function() {
		/*<![CDATA[*/
		var path = /*[[@{/}]]*/'remove';
		/*]]>*/
		
		bootbox.confirm({
			message: "Are You sure? The action cant be undone.",
		buttons: {
			cancel: {
				label:'<i class="fa fa-times"></i> Cancel'
			},
			confirm: {
				label:'<i class="fa fa-check"></i> Confirm'
			}
		},
		callback: function(confirmed) {
			if(confirmed) {
				$.ajax({
					type: 'POST',
					url: path,
					data: JSON.stringify(foodIdList),
					contentType: "application/json",
					success: function(res) {console.log(res); location.reload()},
					error: function(res){console.log(res); location.reload();}
				
				});
			}
		}
			
			
			
		});
		
	});
	
	$("selectAllFoods").click(function() {
		if($(this).prop("checked")==true) {
			$(".checkBox").click();
		} else if ($(this).prop("checked")==false) {
			$(".checkBox").click();
		}
	})
	
});

