 }
        public int carsSoldInASpecificYearNo(int specificYear)
        {
            int count = 0;
            for (int i = 0; i<carAmount;i++)
            {
                if (specificYear==car[i].getDateSold().getYear())
                {
                    count++;
                }
            }
            return count;
        }
