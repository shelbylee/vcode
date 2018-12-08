# 接口统一规范

## 请求相关
### 请求方法
    GET 读取
    PUT 更新
    POST 创建
    DELETE 删除
### 请求类型
    application/json
### 请求格式
    {
        "参数1": <Any>,
        "参数2": <Any>,
        ...
    }

## 响应相关
### 响应类型
    application/json
### 响应格式
    {
        "success": <Boolean>,      
        "error": null or <String>, 
        "data": null or <Any>
    }
    // success为true时，请求成功，error为null，data为null或Response数据
    // success为false时，请求失败，data为null，error为字符串描述的失败原因

# 接口描述文档

## 创建题目
    POST /api/problem
### RequestBody
    {
        "token": <String>, // required: 会话token，需要管理权限
        "title": <String>, // required: 题目标题，unique
        "description": <String>, // required: 题目描述，markdown
        "time_limit": <Number>, // required: 时间限制，ms
        "memory_limit": <Number>, // required: 内存限制，kb
        "level": <Number>, // required: 难度，1~3
        "tags": [<String>, ...] // optianal: 题目标签
    }
### ResponseBody
    None

## 查询题目列表
    GET /api/problem/list
### RequestBody
    None
### ResponseBody
    [{
        "id": <String>,
        "author": <String>,
        "title": <String>,
        "level": <Number>,
        "tags": [<String>, ...],
        "created_at": <TimeStamp>,
        "updated_at": <TimeStamp>
    }, ...]

## 查询题目详情
    GET /api/problem/<ID:Number>
### RequestBody

### ResponseBody
