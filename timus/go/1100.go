package main
import (
	"fmt"
	"strconv"
	"bytes"
)

type Team struct{
	id, solved int
}

func main() {
   var total, id, solved int
   var results []Team

   fmt.Scan(&total)
   for i := 0; i < total; i++ {
   	fmt.Scan(&id)
   	fmt.Scan(&solved)
   	results = append(results, Team{id:id, solved:solved})
   }

	// #Gives TLE, no idea how to solve. Probably an IO problem.
	var buffer bytes.Buffer

	for i := 100; i >= 0; i-- {
		for j := 0; j < total; j++ {
			if results[j].solved == i {
				buffer.WriteString(strconv.Itoa(results[j].id))
				buffer.WriteString(" ")
				buffer.WriteString(strconv.Itoa(results[j].solved))
				buffer.WriteString("\n")
			}
			
		}
	}

	fmt.Println(buffer.String())
	
}