$(function getAllRooms() {
        $.ajax({
            url: 'http://localhost:8080/api/courses/all',
            type: 'GET',
            contentType: 'application/json',
            dataType: "json"
        }).done(function (data) {

            $('#roomTable').dataTable({
                data: data,
                columns: [
                    { data: "courseId", title: "Course Id" },
                    { data: "courseTitle", title: "Title" },
                    { data: "courseLevel", title: "Level" },
                    { data: "courseTeacher", title: "Teacher" },
                    {
                        title: "Edit",
                        data: "courseId",
                        "searchable": false,
                        "sortable": false,
                        "render": function (data) {
                            var courseIdEdit = "editCourse.html?id=" + data;
                            //                     console.log(courseIdEdit);
                            return '<a href="' + courseIdEdit + '" class="editCourse"><i class="fa fa-pencil fa-fw"></a>';
                        }
                    },
                    {
                        title: "Delete",
                        data: "courseId",
                        "searchable": false,
                        "sortable": false,
                        "render": function (data) {
                            var courseIdEdit = "deleteCourse.html?id=" + data;
                            return '<a href="' + courseIdEdit + '" class="deleteCourse"><i class="fa fa-trash fa-fw"></a>';
                        }
                    }
                ]
            });
        });
    });
