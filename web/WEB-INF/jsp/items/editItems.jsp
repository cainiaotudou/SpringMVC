<%--
  Created by IntelliJ IDEA.
  User: Zhang
  Date: 2018/12/3
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>修改商品信息</title>
</head>
<body>
    <form id="itemForm" action="${pageContext.request.contextPath}/items/editItemsSubmit.action" method="post" >
        <input type="hidden" name="id" value="${itemsUp.id}">
        修改商品信息：
        <table width="100%" border="1">
            <tr>
                <td>商品名称</td>
                <td><input type="text" name="name" value="${itemsUp.name}"></td>
            </tr>
            <tr>
                <td>商品价格</td>
                <td><input type="text" name="price" value="${itemsUp.price}"></td>
            </tr>
            <%--<tr>--%>
                <%--<td>商品生产日期</td>--%>
                <%--<td><input type="text" name="createtime" value="<fmt:formatDate value="${itemsUp.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>商品图片</td>--%>
                <%--<td>--%>
                    <%--<c:if test="${itemsUp.pic != null}">--%>
                        <%--<img src="/pic/${itemsUp.pic}" width="100" height="100">--%>
                        <%--<br>--%>
                    <%--</c:if>--%>
                    <%--<input name="pictureFile" type="file">--%>
                <%--</td>--%>
            <%--</tr>--%>
            <tr>
                <td>商品简介</td>
                <td>
                    <textarea rows="3" cols="30" name="detail">${itemsUp.detail}</textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>

</body>
</html>
