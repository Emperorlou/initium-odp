Width: <input type='text' id='width' value=20 />
Height: <input type='text' id='height' value=20 />
Seed: <input type='text' id='seed' value=123456 />
<button id="somebutton">press here</button>

<script type="text/javascript" src="javascript/Sandbox.js"></script>
<script>
    $(document).on("click", "#somebutton", function() {
        getTilePos();
    });
</script>