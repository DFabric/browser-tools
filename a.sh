cat .gitmodules | while read line; do
  case $line in
    path*) path=${line#*= };;
    url*) url=${line#*= };;
    branch*) branch=${line#*= }; git clone $url -b $branch $path;;
  esac
done
