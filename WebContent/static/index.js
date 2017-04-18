/**
 * 
 */

$(function() {
        $('#bb').combobox({
    	url: rc + "/name",
    	method:'post', 
    	mode:'remote',
    	valueField:'name',
    	textField:'name'
    	});
})