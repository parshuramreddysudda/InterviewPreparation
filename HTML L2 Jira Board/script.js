function drag(ev) {
            ev.dataTransfer.setData("text", ev.target.id);
        }

        function allowDrop(ev) {
            ev.preventDefault();
        }

        function drop(ev) {
            ev.preventDefault();
            var data = ev.dataTransfer.getData("text");
            ev.currentTarget.appendChild(document.getElementById(data));
            document.getElementById("todoID").innerHTML=document.getElementById("todo").childElementCount-2;
            document.getElementById("inprogressID").innerHTML=document.getElementById("inprogress").childElementCount-1;
            document.getElementById("inprogress2ID").innerHTML=document.getElementById("inprogress2").childElementCount-1;
            document.getElementById("doneID").innerHTML=document.getElementById("done").childElementCount-1;
        }


        function createTask(){
            var x = document.getElementById("inprogress");
            var x1 = document.getElementById("inprogress2");
            var y = document.getElementById("done");
            var z = document.getElementById("create-new-task-block");
            if (x.style.display === "none") {
                x.style.display = "block";
                y.style.display = "block";
                x1.style.display = "block";
                z.style.display = "none";
            } else {
                x.style.display = "none";
                y.style.display = "none";
                x1.style.display = "none";
                z.style.display = "flex";
            }
        }

        function saveTask(){
            var todo = document.getElementById("todo");
            var taskName = document.getElementById("task-name").value;
            todo.innerHTML += `
            <div class="task" id="${taskName.toLowerCase().split(" ").join("")}" draggable="true" ondragstart="drag(event)">
                <span>${taskName}</span>
            </div>
            `
        }

        function editTask(){
            var saveButton = document.getElementById("save-button");
            var editButton = document.getElementById("edit-button");
            if (saveButton.style.display === "none") {
                saveButton.style.display = "block";
                editButton.style.display = "none";
            } else{
                saveButton.style.display = "none";
                editButton.style.display = "block";
            }
        }