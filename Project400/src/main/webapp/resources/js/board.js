	function iconAppend(data, ok) {
		var str="<li class='col-xs-3'>";
		if(checkImg(data)){
			str+="<img data-url='"+data+"' class='board_img_icon' src='/display?filename="+data+"'>";
		}else{
			str+="<img data-url='"+data+"' class='board_img_icon' src='/resources/img/gt.png'>"
		}
		str+="<div>";
		str+="<span>"+getOriginalName(data)+"</span>";
		if(ok){
			str+="<a class='btn btn-danger btn-xs delbtn' href='"+data+"'><span class='glyphicon glyphicon-remove'></span></a>"
		}
		str+="</div>";
		
		$(".uploadedList").append(str);
	} 
	
	function checkImg(filename) {
		var type=filename.substring(filename.lastIndexOf(".")+1);
		type=type.toLowerCase();
		if(type=="png" || type=="jpg" || type=="jpeg" || type=="gif"){
			return true;
		}else{
			return false;
		} 
	}
	
	function getOriginalName(filename){
		if(checkImg(filename)){
			var idx=filename.indexOf("_", 14)+1;

		}else{
			var idx=filename.indexOf("_")+1;
		}
		filename=filename.substring(idx);
		return filename;
	}
	
	function getImageName(filename){
		var prefix=filename.substring(0, 12);
		var suffix=filename.substring(14);
		return prefix+suffix;
	}