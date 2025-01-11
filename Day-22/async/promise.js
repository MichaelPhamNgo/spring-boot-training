// new Promise(function(resolve, reject){})


var qa = new Promise(function(resolve, reject){
	if(true){
		resolve("success");
	}else{
		reject("failed");
	}
});

qa.then((response)=>{console.log(response + "  resolve"),
	(error)=>{console.log(error+"  error")}
})