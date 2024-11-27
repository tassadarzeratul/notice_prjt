$(document).ready(function(){
    $("#codeGroupListBtn").on("click", function() {
        alert("버튼 클릭했음");
        $.ajax({
            type:"GET",
            url:"/code/list",
            contentType: "application/json; charset=UTF-8",
            success : function(data) {
                alert(data);
                alert(JSON.stringify(data));

                $("#codegroupdata").empty();

                let tablelist = `
                <input type="text" id="searchInput" placeholder="검색..." style="margin: 10px;">
                    <button>찾기</button>
                    <table border="1"  align="center"  width="80%">
                        <tr align="center"   bgcolor="#ff033e">
                          <td><b>번호</b></td>
                          <td><b>구분</b></td>
                          <td><b>제목</b></td>
                          <td><b>등록일</b></td>
                       </tr>
                `;

                data.forEach(codeGroup => {
                    tablelist += `
                        <tr align="center">
                          <td>${codeGroup.code_detail}</td>
                          <td>${codeGroup.code_group}</td>
                          <td>${codeGroup.detail_name}</td>
                          <td>${codeGroup.use_yn}</td>
                          <td>${codeGroup.created_date}</td>
                          <td>${codeGroup.created_id}</td>
                        </tr>
                    `;
                });

                tablelist += `</table>`;

                $("#codegroupdata").html(tablelist);



            },
            error : function(xhr, status, error) {
                alert("code:"+xhr.status + "\n"
                        +"message:"+ xhr.responseText + "\n"
                        +"error:" + error);
            }
        });
    });
});