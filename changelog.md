自动生成CHANGELOG.md

$ npm install -g conventional-changelog-cli
$ cd my-project
$ conventional-changelog -p angular -i CHANGELOG.md -s

如果你想生成所有发布的 Change log，要改为运行下面的命令

$ conventional-changelog -p angular -i CHANGELOG.md -s -r 0
配置在npm中

{
  "scripts": {
    "changelog": "conventional-changelog -p angular -i CHANGELOG.md -s -r 0" 
  } 
}
 angular规范

<type>(<scope>) : <subject>
//换行
<body>
//换行
<footer><br><br>type取值:
feat：新功能（feature）
fix：修补bug
docs：文档（documentation）
style： 格式（不影响代码运行的变动）
refactor：重构（即不是新增功能，也不是修改bug的代码变动）
test：增加测试
chore：构建过程或辅助工具的变动
　　  scope用于说明 commit 影响的范围，比如数据层、控制层、视图层等等，视项目不同而不同

   subject是 commit 目的的简短描述，不超过50个字符。

　　  body 部分是对本次 commit 的详细描述，可以分成多行。

　　例:

git commit -m "feat(数据层影响): test"
　　