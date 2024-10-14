<!DOCTYPE html>
<html lang="en">
    @php 
        $myvar = 1;
        $myname= 2;
    @endphp
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="{{asset('CSS/style.css')}}">
</head>
<body>
    <img src="{{asset('images/img.jpg')}}" alt="">
<h5>Olá sou a nossa casa!</h5>

    <p>{{ $myvar }}</p>

    @if ($myname)
        <p>{{ $myname }}</p>
    @else
        <p>Não existe var myname</p>
    @endif
    <ul>
        <li><a href="{{ route('welcome') }}">Welcome</a></li>
        <li><a href="{{ route('users.all') }}">Todos os Users</a></li>
        <li><a href="{{ route('users.add') }}">Adicionar</a></li>
    </ul>

</body>
</html>