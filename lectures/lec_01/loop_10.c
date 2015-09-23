/**
 * @author Michael Stergianis
 *
 * This program loops and prints out the natural numbers from one
 **/

int main()
{
  int i;
  for (i = 0; i < 9; i++)
  {
    fprintf(stdout, "%d", (i+1));
  }

  return 0;
}
